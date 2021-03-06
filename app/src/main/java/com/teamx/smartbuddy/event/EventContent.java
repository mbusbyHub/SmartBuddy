package com.teamx.smartbuddy.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 */
public class EventContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<EventItem> ITEMS = new ArrayList<EventItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, EventItem> ITEM_MAP = new HashMap<String, EventItem>();

    static {
        addItem(createEventItem(1, "Wake Up", "8:00 AM"));
        addItem(createEventItem(2, "Shower", "8:05 AM"));
        addItem(createEventItem(3, "Get Dressed", "8:15 AM"));
        addItem(createEventItem(4, "Breakfast", "8:25 AM"));
        addItem(createEventItem(5, "Leave", "8:45 AM"));
        addItem(createEventItem(6, "Arrive", "9:00 AM"));
    }

    private static void addItem(EventItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static EventItem createEventItem(int position, String eventName, String time) {
        return new EventItem(String.valueOf(position), eventName, time, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class EventItem {
        public final String id;
        public final String event;
        public final String time;
        public final String details;

        public EventItem(String id, String event, String time, String details) {
            this.id = id;
            this.event = event;
            this.time = time;
            this.details = details;
        }

        @Override
        public String toString() {
            return event;
        }
    }
}
