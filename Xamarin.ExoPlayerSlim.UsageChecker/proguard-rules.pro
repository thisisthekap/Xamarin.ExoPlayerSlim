# needed to fix exoplayer video playback

-keep public class androidx.core.app.*
-keep public class androidx.appcompat.widget.*
-keep public class com.google.android.exoplayer2.** { *; }
-keep class com.tonestro.exoplayerslim.* { *; }
