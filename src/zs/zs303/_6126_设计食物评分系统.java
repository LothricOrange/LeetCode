package zs.zs303;

import java.util.*;

public class _6126_设计食物评分系统 {
    Map<String, TreeSet<String>> mapForCuisines = new HashMap<>();
    Map<String, Integer> mapForFoods = new HashMap<>();
    public _6126_设计食物评分系统(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            mapForFoods.put(foods[i], ratings[i]);
            TreeSet<String> set;
            if (mapForCuisines.containsKey(cuisines[i])) {
                set = mapForCuisines.get(cuisines[i]);
                set.add(foods[i]);
            } else {
                set = new TreeSet<>();
                set.add(foods[i]);
                mapForCuisines.put(cuisines[i], set);
            }

        }
    }

    public void changeRating(String food, int newRating) {
        mapForFoods.put(food, newRating);
    }

    public String highestRated(String cuisine) {
        String res = null;
        int max = 0;
        TreeSet<String> set = mapForCuisines.get(cuisine);
        //set = (TreeSet) set.descendingSet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String food = it.next();
            int rating = mapForFoods.get(food);
            if (rating > max) {
                res = food;
                max = rating;
            }
        }

        return res;
    }
}
