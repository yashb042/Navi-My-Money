package com.yashbansal.navi.assignment.mymoney;

import com.yashbansal.navi.assignment.mymoney.service.MyMoneyDriver;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

import java.util.InputMismatchException;


@SpringBootApplication
@Order(-1) // todo: enable
@Log4j2
public class MyMoneyApplication implements CommandLineRunner {

  final MyMoneyDriver myMoneyDriver;

  public MyMoneyApplication(MyMoneyDriver myMoneyDriver) {
    this.myMoneyDriver = myMoneyDriver;
  }

  public static void main(String[] args) {
    SpringApplication.run(MyMoneyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (args.length < 1) {
      log.info("Switching to BATCH-PROCESSING Mode");
      myMoneyDriver.executeCommandsFromFile("src/main/resources/inputFile");

    } else if (args.length != 1) {
      log.error("No input arguments were supplied");
      throw new InputMismatchException(
          "Please specify only the input file, or to run in CLI mode provide SHELL as argument");
    }

    String input = args[0];
    if ("shell".equalsIgnoreCase(input)) {
      log.info("Switching to SHELL Mode");
      return;
    }
    log.info("Switching to BATCH-PROCESSING Mode");
    myMoneyDriver.executeCommandsFromFile(input);
    System.exit(0);
  }
}
