# PG-Annotations
PG Annotations is a utility library that allows classes, methods, and fields to be annotated for ProGuard purposes instead of defining them in the ProGuard file.

Here is a description of the possible annotations:
* **@Keep** Used to prevent objects from being renamed and removed. Similar to ProGuard `keep` option.
* **@KeepName** Used to prevent objects from being renamed. Similar to ProGuard `keepnames` option.
* **@KeepObject** Used to prevent objects from being removded. Similar to ProGuard `keep,allowobfuscation` option.

To use PG-Annotations in your own proguard file, copy and paste the following into your project's ProGuard file.
```
-keep @coding.solving.pgannotations.Keep class * { <init>(...); }
-keep,allowshrinking @coding.solving.pgannotations.KeepNames class * { <init>(...); }
-keep,allowobfuscation @coding.solving.pgannotations.KeepObject class * { <init>(...); }
-keepclassmembers class * { @coding.solving.pgannotations.Keep *; }
-keepclassmembers,allowshrinking class * { @coding.solving.pgannotations.KeepNames *; }
-keepclassmembers,allowobfuscation class * { @coding.solving.pgannotations.KeepObject *; }
```
