package com.example.stockplus.service;

import com.example.stockplus.grpc.StockTradingServiceGrpc;
import com.example.stockplus.grpc.StockRequest;
import com.example.stockplus.grpc.StockResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class StockClientService {

    @GrpcClient("stockService")
    private StockTradingServiceGrpc.StockTradingServiceBlockingStub stockStub;

    public StockResponse getPrice(String symbol) {
        StockRequest request = StockRequest.newBuilder().setStockSymbol(symbol).build();
        return stockStub.getStockPrice(request);
    }

    public String getStockSymbol(String stockId) {
        return "AAPL"; 
    }
}
