// String operations
val st = "This is a long string"
st.charAt(3)
st charAt(3)
st slice(3,6)

// Patern matches
val st2 = "term1 term2 term3"
st2 matches("term1 term2 term3") // true
st2 matches("term1") // false
st2 contains "term1" // true