class Merge_Strings_Alternately:
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        r=""
        for i in range(min(len(word1),len(word2))):
            r+=word1[i]
            r+=word2[i]
        if(len(word1)>len(word2)):
            for i in range(len(word2),len(word1)):
                r+=word1[i]
        elif(len(word2)>len(word1)):
            for i in range(len(word1),len(word2)):
                r+=word2[i]
        return r
word1 = "abc"
word2 = "pqr"
p=Merge_Strings_Alternately()
print(p.mergeAlternately(word1,word2))