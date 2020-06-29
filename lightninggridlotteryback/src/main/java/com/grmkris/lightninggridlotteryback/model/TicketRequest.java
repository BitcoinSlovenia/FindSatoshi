package com.grmkris.lightninggridlotteryback.model;

import lombok.Builder;
import lombok.Data;

// To je ticket, ki ga user izpolne na spletni strani. vnese svoj ime, email in številke
// to jaz sprejmem na backend
@Data
@Builder
public class TicketRequest{

    String secret; 
    String predict;
    
}