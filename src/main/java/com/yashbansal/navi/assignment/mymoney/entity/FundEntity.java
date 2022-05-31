package com.yashbansal.navi.assignment.mymoney.entity;

import com.yashbansal.navi.assignment.mymoney.enums.AssetClass;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class FundEntity {
  @NonNull private AssetClass assetClass;
  @NonNull private Double amount;
}
