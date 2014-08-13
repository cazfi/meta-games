FREECIV_GUI = "gtk2"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

DEPENDS += "curl xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "437f9a4aadb80619a7c5ae9643142b8b"
SRC_URI[sha256sum] = "7f107fe3b09f37934410dc7a64ac1b99a95997ddf53da53933b75d4da79fa899"
