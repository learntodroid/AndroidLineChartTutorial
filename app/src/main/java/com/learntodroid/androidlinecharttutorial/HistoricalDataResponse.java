package com.learntodroid.androidlinecharttutorial;

import java.util.List;

public class HistoricalDataResponse {
    List<StockPrice> prices;
    boolean isPending;
    long firstTradeDate;
    String id;

    class StockPrice {
        long date;
        float open;
        float high;
        float low;
        float close;
        int volume;
        float adjclose;
    }
}
