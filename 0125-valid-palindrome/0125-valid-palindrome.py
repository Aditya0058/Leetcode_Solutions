class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        cleaned = "".join(filter(lambda c: c.isalnum(), s)).lower()
        reverse = ""
        for i in range(len(cleaned)-1, -1, -1):
            reverse = reverse+cleaned[i]

        if reverse == cleaned:
            return True
        else:
            return False 
        