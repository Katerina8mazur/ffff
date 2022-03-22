class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode first = null;
        ListNode last = null;
        while (true) {
            int indexOfList = 0;
            int mini = 100000000;
            boolean flag = false;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < mini) {
                    mini = lists[i].val;
                    indexOfList = i;
                    flag = true;
                }
            }
            if (flag) {
                if (first == null) {
                    first = new ListNode(mini);
                    last = first;
                } else {
                    last.next = new ListNode(mini);
                    last = last.next;

                }
                lists[indexOfList] = lists[indexOfList].next;
            }
            int count = 0;
            for (int j = 0; j < lists.length; j++) {
                if (lists[j] == null) {
                    count++;
                }
            }
            if (count == lists.length) {
                break;
            }

        }
        return first;
    }
}