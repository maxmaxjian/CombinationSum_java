import java.util.*;

import static java.util.Comparator.*;

public class Solution1 implements Solution {
    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (target < 0) {
            return null;
        } else if (target == 0) {
            return Collections.singletonList(new ArrayList<>());
        } else {
            Set<List<Integer>> result = new HashSet<>();
            for (int i = 0; i < candidates.length; i++) {
                List<List<Integer>> tmp = combinationSum(candidates, target-candidates[i]);
                if (tmp != null) {
                    for (List<Integer> list : tmp) {
                        list.add(candidates[i]);
                        list.sort(naturalOrder());
                        result.add(list);
                    }
                }
            }
            return new ArrayList<>(result);
        }

    }
}
