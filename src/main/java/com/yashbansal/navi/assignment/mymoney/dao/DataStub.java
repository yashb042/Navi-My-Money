package com.yashbansal.navi.assignment.mymoney.dao;

import com.yashbansal.navi.assignment.mymoney.dto.MyMoneyFundPortfolio;
import com.yashbansal.navi.assignment.mymoney.enums.AssetClass;
import lombok.Getter;
import org.springframework.context.annotation.Scope;

import java.time.Month;
import java.util.*;


@Getter
@Scope("singleton")
public class DataStub {
  public TreeMap<Month, MyMoneyFundPortfolio> monthlyBalance = new TreeMap<>();
  public TreeMap<Month, Map<AssetClass, Double>> monthlyMarketChangeRate = new TreeMap<>();
  public MyMoneyFundPortfolio initialAllocation;
  public MyMoneyFundPortfolio initialSip;
  public Map<AssetClass, Double> desiredWeights = new HashMap<>();
  public Set<AssetClass> defaultAssetOrderForIO = new LinkedHashSet<>();
}
