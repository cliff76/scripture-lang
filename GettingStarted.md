# Introduction #

Scripture's syntax is inspired from Java, Python, and Ruby. So if you already know any of these languages, Scripture's syntax will be very easy to learn.  In the current implementation, many of the keywords can be written in Latin and English (more language coming soon).


# Details #

Below is a list of Scriptures lexemes, with examples on how they are used:
  * **scripture** indicates the start of the namespace.  Think of this as a Java package.  It's used as follows:
```
scriptura mynamespace:
    # More code here.
amen
```
  * **amen** indicates the end of a block.  It is used to close scripture, order, prophecy, commandment, and if blocks.
  * Single line comments start with a hash mark '#'.
  * Multi-line comments are done c-style, e.g. '/**' + '**/'.