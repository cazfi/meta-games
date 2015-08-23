FREECIV_GUI = "gtk2"

require freeciv.inc

DEPENDS += "curl xz"

EXTRA_OECONF += "--disable-mapimg"

SRC_URI[md5sum] = "fae43d37c65416c104595713e337a740"
SRC_URI[sha256sum] = "ce4e5d083d26c7323e781d0803e858fb9be986858d9f776b8a9a97544e13b3f9"
