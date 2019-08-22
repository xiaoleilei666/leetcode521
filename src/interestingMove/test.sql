#找出所有影片的描述为非boring(不无聊)的并且id为奇数的影片，结果按等级rating排列
#+---------+-----------+--------------+-----------+
#|   id    | movie     |  description |  rating   |
#+---------+-----------+--------------+-----------+
#|   1     | War       |   great 3D   |   8.9     |
#|   2     | Science   |   fiction    |   8.5     |
#|   3     | irish     |   boring     |   6.2     |
#|   4     | Ice song  |   Fantacy    |   8.6     |
#|   5     | House card|   Interesting|   9.1     |
#+---------+-----------+--------------+-----------+

#在mysql中<>与！= 作用等效，可以互换
select * from cinema where description <> 'boring' and mod(id, 2) = 1 order by rating desc;