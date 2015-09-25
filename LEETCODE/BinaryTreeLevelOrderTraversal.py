# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if root is None:
            return []
        
        queue_up = [root]

        result = [[root.val]]
        
        while len(queue_up) :
            print queue_up
            queue_down_val = []
            queue_down = []
            for node in queue_up:
                left, right = node.left, node.right
                if node.left is not None:
                    queue_down.append(left)
                    queue_down_val.append(left.val)
                if node.right is not None:
                    queue_down.append(right)
                    queue_down_val.append(right.val)
            if len(queue_down_val):
                result.append(queue_down_val)
            queue_up = queue_down
                
        return result
                   
