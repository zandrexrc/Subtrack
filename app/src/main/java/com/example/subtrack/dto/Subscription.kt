package com.example.subtrack.dto

data class Subscription(
    val id: String,
    val name: String,
    val firstBillingDate: String,
    val billingCycle: String,
    val category: String = "",
    val color: String,
    val amount: Double
)
