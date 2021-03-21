class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        canEat = len(candyType) // 2
        uniqueType = set(candyType)
        
        return min(canEat, len(uniqueType))
