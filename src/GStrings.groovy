// declaring String variables
s1 = "Hello \"World\""
s2 = 'Hello "World"'
assert s1 == s2

def s =['h','e','l','l','o'] as char[]
assert new String(s)=='hello'
assert  new String(s,0,4) == 'hell'

s.eachWithIndex{ ch, index-> assert ch == s[index]}