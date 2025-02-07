class Solution(object):
    def canPlaceFlowers(self, fb, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        if len(fb)==1 and fb[0]==0 and n==0:
            return True
        if len(fb)==1 and fb[0]==0 and n==1:
            return True
        elif len(fb)==1 and fb[0]==1 and n==1:
            return False   
        cn=0
        for i in range(len(fb)):
            if i==0:
                if fb[i]==0 and fb[i+1]==0:
                    fb[i]=1
                    cn+=1
            if i==len(fb)-1:
                if fb[i]==0 and fb[i-1]==0:
                    fb[i]=1
                    cn+=1
            if fb[i]==0:
                if fb[i-1]==0 and fb[i+1]==0:
                    fb[i]=1
                    cn+=1
        return cn>=n
s=Solution()
flowerbed = [1,0,0,0,1]
n = 1
print(s.canPlaceFlowers(flowerbed,n))