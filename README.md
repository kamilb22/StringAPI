# StringAPI




# `GET` /lowerCase/{string}
>Counts how many lowercase letters are in the text
 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /lowerCase/Ala Ma Kota

    6
# `GET` /upperCase/{string}
>Counts how many uppercase letters are in the text
 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /upperCase/Ala Ma Kota

    3
# `GET` /numbers/{string}
>Counts how many numbers are in the text
> 
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /numbers/Ala1 Ma Kota6

    2
# `GET` /special/{string}
>Counts how many special characters are in the text
>
| parameter | description |
|--|--|
| string | the text to be processed |

**example** `200`
 `GET` /special/Ala1_ Ma Kota6$_<>

    5
