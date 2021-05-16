package com.myalley.junit.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustUser {
    String userId;
    String mobileNo;
    String addr;
}
