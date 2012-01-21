package com.github.pkunk.progressquest.gameplay;

/**
 * User: pkunk
 * Date: 2012-01-15
 */
public final class PlotTask {
    private final String description;
    private final int time;
    private final boolean isPlot;

    public PlotTask(String description, int time) {
        this(description, time, false);
    }

    public PlotTask(String description, int time, boolean plot) {
        this.description = description;
        this.time = time;
        isPlot = plot;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }

    public boolean isPlot() {
        return isPlot;
    }
}
