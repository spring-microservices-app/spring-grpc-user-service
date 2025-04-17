package com.example.stockplus.grpc;

import org.springframework.stereotype.Component;

// import stocktrading.StockTradingServiceGrpc;
// import stocktrading.StockRequest;
// import stocktrading.StockResponse;
// import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class StockGrpcClient {

    // @GrpcClient("stock-service")
    // private StockTradingServiceGrpc.StockTradingServiceBlockingStub stockStub;

    // public StockResponse getPrice(String symbol) {
    //     StockRequest request = StockRequest.newBuilder().setStockSymbol(symbol).build();
    //     return stockStub.getStockPrice(request);
    // }
}
