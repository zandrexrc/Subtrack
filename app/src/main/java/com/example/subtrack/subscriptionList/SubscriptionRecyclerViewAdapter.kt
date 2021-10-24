package com.example.subtrack.subscriptionList

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.subtrack.R
import com.example.subtrack.dto.Subscription

import com.example.subtrack.subscriptionList.placeholder.PlaceholderContent.PlaceholderItem


class SubscriptionRecyclerViewAdapter(
    private val values: List<Subscription>
) : RecyclerView.Adapter<SubscriptionRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_subscription, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val subscription = values[position]
        holder.bind(subscription)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val subscriptionDateView: TextView = itemView.findViewById(R.id.subscription_billing_date)
        private val subscriptionNameView: TextView = itemView.findViewById(R.id.subscription_name)
        private val subscriptionAmountView: TextView = itemView.findViewById(R.id.subscription_amount)
        private var currentSubscription: Subscription? = null

        @SuppressLint("SetTextI18n")
        fun bind(subscription: Subscription) {
            currentSubscription = subscription;
            subscriptionDateView.text = subscription.firstBillingDate
            subscriptionNameView.text = subscription.name
            subscriptionAmountView.text = "kr ${subscription.amount.toString()}"
        }
    }

}