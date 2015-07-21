CoDScriptizer
=============

A tool for analyzing and generating CoDScript code

# Important announcement

This project is a work in progress and incomplete. This is a very low priority side project to challenge myself in the field of programming language parsing whenever I am in a mood.

ANTLR is a great tool and probably one of the easiest ones to get started with parser generators, however I hit a brick wall when trying to implement a linter with it. A great linter shouldn't take longer than 50-100ms to process a reasonably sized file for that specific language. However _globallogic.gsc is rather complex for a parser generated with ANTLR for Java/C# targets, also the time that it takes JVM, CLR to start up is a little too high to be any use as a linter. One solution that I was suggested by an university assistant was to use a TCP server running in background, but it still feels a little too slow even with the ANTLR-s engine heated up. It's ok if you didn't understand anything I just wrote.

I have no plans of writing my own recursive descent parser and lexer for CoDScript (Infinity Ward even uses/used bison/flex).

So what now? I am waiting for ANTLR4 C++ implementation to be finished, which should introduce a significant performance boost I am looking for.

During that time the grammar for CoDScript can be perfected (the puzzle pieces that make up the language).
