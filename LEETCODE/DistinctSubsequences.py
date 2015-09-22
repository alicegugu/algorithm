class Solution(object):
    def numDistinct(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        
        append_table = {}
        position = 0
        pre_result = []
        result = []
        for c in t:
            if c in append_table:
                append_table[c].append(position)
            else:
                append_table[c]=[position]
            pre_result.append(0)
            result.append(0)
            position += 1


        for c in s:
            if c in append_table:
                appendation = append_table[c]
                if appendation != None:
                    for p in appendation:
                        if p == 0:
                            result[0] = pre_result[0]+1
                        else:
                            result[p] = pre_result[p-1]+pre_result[p]
                    pre_result = list(result)
            else:
                continue

        return result[position -1]
