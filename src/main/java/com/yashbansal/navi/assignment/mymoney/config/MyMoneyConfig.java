package com.yashbansal.navi.assignment.mymoney.config;

import com.yashbansal.navi.assignment.mymoney.enums.AssetClass;
import com.yashbansal.navi.assignment.mymoney.dao.DataStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyMoneyConfig {

  @Bean
  // Bean for DataStub with the initialized values
  public DataStub dataStub() {
    DataStub stub = new DataStub();
    stub.defaultAssetOrderForIO.add(AssetClass.ASSET_EQUITY);
    stub.defaultAssetOrderForIO.add(AssetClass.ASSET_DEBT);
    stub.defaultAssetOrderForIO.add(AssetClass.ASSET_GOLD);
    return stub;
  }
}
