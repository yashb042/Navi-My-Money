package com.yashbansal.navi.assignment.mymoney.constant;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

import static com.yashbansal.navi.assignment.mymoney.constant.MyMoneyConstants.SHELL_PROMPT;


@Component
public class MyMoneyPromptProvider implements PromptProvider {
  @Override
  public AttributedString getPrompt() {
    return new AttributedString(
        SHELL_PROMPT, AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));
  }
}
