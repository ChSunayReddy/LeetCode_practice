from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head

        temp = head.next
        head.next = self.swapPairs(head.next.next)
        temp.next = head

        return temp

# Helper function to create a linked list from a list
def create_linked_list(lst):
    if not lst:
        return None
    head = ListNode(lst[0])
    current = head
    for val in lst[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

# Helper function to print a linked list
def print_linked_list(head):
    values = []
    while head:
        values.append(str(head.val))
        head = head.next
    print(" -> ".join(values))

# Main method to test swapPairs
if __name__ == "__main__":
    input_list = [1, 2, 3, 4]
    head = create_linked_list(input_list)
    print("Original List:")
    print_linked_list(head)

    solution = Solution()
    swapped_head = solution.swapPairs(head)

    print("Swapped List:")
    print_linked_list(swapped_head)
