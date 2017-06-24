package com.kiwi.redbox.redbox.fragments.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WatchingFlightsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WatchingFlight> ITEMS = new ArrayList<WatchingFlight>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WatchingFlight> ITEM_MAP = new HashMap<String, WatchingFlight>();

    private static final int COUNT = 3;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(WatchingFlight item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WatchingFlight createDummyItem(int position) {
        return new WatchingFlight(String.valueOf(position), "Item " + position, makeDetails(position));
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
    public static class WatchingFlight {
        public final String id;
        public final String content;
        public final String details;

        public final String src = "Milan";
        public final String dst = "Prague";


        public WatchingFlight(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(src).append(" -> ").append(dst);
            builder.append(" ").append(content);
            return builder.toString();
        }
    }
}
