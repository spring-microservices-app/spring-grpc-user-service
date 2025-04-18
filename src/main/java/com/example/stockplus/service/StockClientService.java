package com.example.stockplus.service;

import com.example.stockplus.grpc.StockTradingServiceGrpc;
import com.example.stockplus.grpc.StockRequest;
import com.example.stockplus.grpc.StockResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class StockClientService {

    // "stockService" is the name of the gRPC service
    // defined in the application.yml file under grpc.clients
    // The name should match the service name in the gRPC server
    @GrpcClient("stockService")
    private StockTradingServiceGrpc.StockTradingServiceBlockingStub stockStub;

    public StockResponse getPrice(String symbol) {
        StockRequest request = StockRequest.newBuilder().setStockSymbol(symbol).build();
        return stockStub.getStockPrice(request);
    }

    public String testConnection() {
        StockRequest request = StockRequest.newBuilder().setStockSymbol("APL").build();
        StockResponse response = stockStub.getStockPrice(request);
        return "hello";
    }

    public String getStockSymbol(String stockId) {
        return "AAPL"; 
    }
}
