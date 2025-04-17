
package com.example.stockplus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
// import com.fasterxml.jackson.databind.JsonNode;

// import com.example.stockplus.grpc.client.StockGrpcClient;
// import com.example.stockplus.model.Stock;
// import com.example.stockplus.model.User;
// import com.example.stockplus.grpc.StockResponse;
// import com.example.stockplus.grpc.StockRequest;
// import com.example.stockplus.grpc.StockTradingServiceGrpc;
// import com.example.stockplus.grpc.StockTradingServiceGrpc.StockTradingServiceBlockingStub;
// import com.example.stockplus.grpc.StockTradingServiceGrpc.StockTradingServiceStub;


@RestController
public class UserController {

    @Autowired
    private ApplicationContext applicationContext;

    // @Autowired
    // @Qualifier("stockGrpcClient")
    // private StockGrpcClient stockGrpcClient;

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody Map<String, Object> user) {
        // Handle user creation logic here
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

//     @GetMapping("/stock/{symbol}")
//     public ResponseEntity<?> getStockInfo(@PathVariable String symbol) {
//         StockResponse stock = stockGrpcClient.getPrice(symbol);
//         return ResponseEntity.ok(stock);
//     }
}