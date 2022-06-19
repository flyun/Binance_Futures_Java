package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class AccountBalance {

    private String accountAlias;

    private String asset;

    private BigDecimal balance;

    private BigDecimal withdrawAvailable;
    private BigDecimal crossWalletBalance;
    private BigDecimal crossUnPnl;
    private BigDecimal availableBalance;
    private BigDecimal maxWithdrawAmount;
    private boolean marginAvailable;
    private double updateTime;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getWithdrawAvailable() {
        return withdrawAvailable;
    }

    public void setWithdrawAvailable(BigDecimal withdrawAvailable) {
        this.withdrawAvailable = withdrawAvailable;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    public BigDecimal getCrossWalletBalance() {
        return crossWalletBalance;
    }

    public void setCrossWalletBalance(BigDecimal crossWalletBalance) {
        this.crossWalletBalance = crossWalletBalance;
    }

    public BigDecimal getCrossUnPnl() {
        return crossUnPnl;
    }

    public void setCrossUnPnl(BigDecimal crossUnPnl) {
        this.crossUnPnl = crossUnPnl;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(BigDecimal maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public boolean isMarginAvailable() {
        return marginAvailable;
    }

    public void setMarginAvailable(boolean marginAvailable) {
        this.marginAvailable = marginAvailable;
    }

    public double getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(double updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("asset", asset)
                .append("balance", balance).append("withdrawAvailable", withdrawAvailable)

                .append("withdrawAvailable",withdrawAvailable)
                .append("crossWalletBalance",crossWalletBalance)
                .append("crossUnPnl",crossUnPnl)
                .append("availableBalance",availableBalance)
                .append("maxWithdrawAmount",maxWithdrawAmount)
                .append("marginAvailable",marginAvailable)
                .append("updateTime",updateTime)
                .toString();
    }
}
