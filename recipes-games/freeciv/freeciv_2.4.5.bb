FREECIV_GUI = "gtk2"

require freeciv.inc

DEPENDS += "libsdl-mixer"

EXTRA_OECONF += "\
SDL_CONFIG='${STAGING_BINDIR_NATIVE}/pkg-config sdl' \
"

SRC_URI[md5sum] = "fae43d37c65416c104595713e337a740"
SRC_URI[sha256sum] = "ce4e5d083d26c7323e781d0803e858fb9be986858d9f776b8a9a97544e13b3f9"
