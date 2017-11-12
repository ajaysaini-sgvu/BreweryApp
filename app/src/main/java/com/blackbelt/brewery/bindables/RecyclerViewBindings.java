package com.blackbelt.brewery.bindables;


import android.databinding.BindingAdapter;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;

import java.util.List;
import java.util.Map;

public class RecyclerViewBindings {

    private static final int KEY_ITEMS = -1024;

    @SuppressWarnings("unchecked")
    @BindingAdapter({"itemViewBinder"})
    public static <T> void setItemViewBinder(RecyclerView recyclerView,
            Map<Class, AndroidItemBinder> itemViewMapper) {
        setItemViewBinder(recyclerView, itemViewMapper, true);
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter({"itemViewBinder", "nestedScrollingEnabled"})
    public static <T> void setItemViewBinder(RecyclerView recyclerView, Map<Class, AndroidItemBinder> itemViewMapper,
            boolean nestedScrollingEnabled) {
        List<T> items = (List<T>) recyclerView.getTag(KEY_ITEMS);
        if (recyclerView.getAdapter() instanceof AndroidBindableRecyclerViewAdapter) {
            ((AndroidBindableRecyclerViewAdapter<T>) recyclerView.getAdapter()).setDataSet(items);
            return;
        }
        AndroidBindableRecyclerViewAdapter adapter = new AndroidBindableRecyclerViewAdapter(itemViewMapper, items);
        recyclerView.setNestedScrollingEnabled(nestedScrollingEnabled);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter("nestedScrollingEnabled")
    public static void setNestedScrollingEnabled(RecyclerView recyclerView, boolean nestedScrollingEnabled) {
        recyclerView.setNestedScrollingEnabled(nestedScrollingEnabled);
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("items")
    public static <T> void setItems(RecyclerView recyclerView, List<T> items) {
        recyclerView.setTag(KEY_ITEMS, items);
        if (recyclerView.getAdapter() instanceof AndroidBindableRecyclerViewAdapter) {
            ((AndroidBindableRecyclerViewAdapter<T>) recyclerView.getAdapter()).setDataSet(items);
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("onItemClickListener")
    public static void setOnItemClickListener(RecyclerView recyclerView, ItemClickListener clickListener) {
        if (recyclerView instanceof AndroidBindableRecyclerView) {
            ((AndroidBindableRecyclerView) recyclerView).setOnItemClickListener(clickListener);
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter({"layoutManager"})
    public static <T> void setLayoutManager(RecyclerView recyclerView,
            LayoutManagers.LayoutManagerFactory layoutManager) {
        RecyclerView.LayoutManager manager = layoutManager.create(recyclerView);
        manager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(manager);
    }

    @BindingAdapter({"itemDecoration"})
    public static void addDividerItemDecoration(RecyclerView recyclerView,
            @LayoutManagers.Orientation final int orientation) {
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), orientation));
    }

    @BindingAdapter({"pageDescriptor"})
    public static void setPageDescriptor(AndroidBindableRecyclerView recyclerView, final PageDescriptor pageDescriptor) {
        recyclerView.setPageDescriptor(pageDescriptor);
    }

    private RecyclerViewBindings() {
    }
}
