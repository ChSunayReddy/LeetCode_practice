from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        n = m = ListNode()
        while list1 and list2:
            if list1.val < list2.val:
                n.next = list1
                list1 = list1.next
            else:
                n.next = list2
                list2 = list2.next
            n = n.next
        if list1:
            n.next = list1
        elif list2:
            n.next = list2
        return m.next

# Helper function to convert a list to a linked list
def create_linked_list(lst):
    dummy = ListNode()
    current = dummy
    for val in lst:
        current.next = ListNode(val)
        current = current.next
    return dummy.next

# Helper function to print a linked list
def print_linked_list(node):
    values = []
    while node:
        values.append(str(node.val))
        node = node.next
    print(" -> ".join(values) if values else "Empty List")

# Main function to test the solution
if __name__ == "__main__":
    list1 = create_linked_list([1, 2, 4])
    list2 = create_linked_list([1, 3, 4])

    solution = Solution()
    merged_list = solution.mergeTwoLists(list1, list2)

    print("Merged Linked List:")
    print_linked_list(merged_list)
