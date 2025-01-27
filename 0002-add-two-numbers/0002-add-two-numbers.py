class Solution:
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode(0)  # A placeholder node for the result linked list
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0  # Get the value from l1, or 0 if it's None
            val2 = l2.val if l2 else 0  # Get the value from l2, or 0 if it's None
            
            # Calculate the sum and carry
            total = val1 + val2 + carry
            carry = total // 10
            current.next = ListNode(total % 10)
            
            # Move to the next nodes
            current = current.next
            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next
        
        return dummy.next
