# x is positive
# Get sqrt of x rounded DOWN to nearest int
# Answer must be positive

class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        val = 0
        mid = x / 2
        left = 0
        right = x
        error = 1
        while abs(error) > 0.00001:
            if mid * mid > x:
                right = mid
                mid = (left + right) / 2
            else:
                left = mid
                mid = (left + right) / 2
            val = mid
            error = x - (val * val)
        return int(val)

        
        