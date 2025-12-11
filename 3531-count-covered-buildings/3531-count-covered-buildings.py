class Solution:
    def countCoveredBuildings(self, n: int, buildings: List[List[int]]) -> int:
        rmax = [0]*(n+1)
        rmin = [n+1]*(n+1)
        cmax = [0]*(n+1)
        cmin = [n+1]*(n+1)
        for x,y in buildings:
            rmax[y] = max(rmax[y],x)
            rmin[y] = min(rmin[y],x)
            cmax[x] = max(cmax[x],y)
            cmin[x] = min(cmin[x],y)
        ans = 0
        for x,y in buildings:
            if cmin[x]<y<cmax[x] and rmin[y]<x<rmax[y]:
                ans+=1
        return ans