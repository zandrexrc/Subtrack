package com.example.subtrack.subscriptionList.placeholder

import com.example.subtrack.dto.Subscription
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<Subscription> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    private val ITEM_MAP: MutableMap<String, Subscription> = HashMap()

    init {
        // Add some sample items.
        addItem(createSubscription(1, "Netflix", "Oct 2"))
        addItem(createSubscription(2, "Amazon Prime", "Oct 4"))
        addItem(createSubscription(3, "HBO", "Oct 5"))
        addItem(createSubscription(4, "Apple TV", "Oct 12"))
        addItem(createSubscription(5, "Viaplay", "Oct 12"))
        addItem(createSubscription(6, "Disney+", "Oct 17"))
        addItem(createSubscription(7, "Discovery+", "Oct 21"))
        addItem(createSubscription(8, "ESPN+", "Oct 23"))
        addItem(createSubscription(9, "Hulu", "Oct 25"))
        addItem(createSubscription(10, "YouTube Premium", "Oct 26"))
        addItem(createSubscription(11, "PornHub Premium", "Oct 31"))
    }

    private fun addItem(item: Subscription) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createSubscription(position: Int, name: String, date: String): Subscription {
        return Subscription(position.toString(),
            name,
            date,
            "monthly",
            "",
            "green",
            99.99 - position,
        )
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0 until position) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A placeholder item representing a piece of content.
     */
    data class PlaceholderItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}