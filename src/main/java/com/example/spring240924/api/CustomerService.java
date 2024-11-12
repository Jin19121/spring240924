package com.example.spring240924.api;

import com.example.spring240924.dto.a6.Customer;
import com.example.spring240924.dto.a6.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CustomerService {
  private final CustomerMapper mapper;

  public Customer getCustomer(Integer customerId) {
    return mapper.selectById(customerId);
  }

  public Supplier getSupplier(Integer supplierId) {
    return mapper.selectBySupplierId(supplierId);
  }
}