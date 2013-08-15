SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SECTION = "games"

SRC_URI = "http://sourceforge.net/projects/extremetuxracer/files/pre-releases/etr-${PV}.tar.xz"

SRC_URI[md5sum] = "0226cc111a232b412a9dc307fffca0d7"
SRC_URI[sha256sum] = "5c1c58d93fd9ded6aa79c66b9fc82834aa943606fcf6406215e8af6b5f2ecf2e"

DEPENDS = "libsdl virtual/libgl libglu libsdl-image libsdl-mixer freetype"

B = "${WORKDIR}/build"

EXTRA_OECONF = "\
SDL_CONFIG=${STAGING_BINDIR_CROSS}/sdl-config \
FT2_CONFIG=${STAGING_BINDIR_CROSS}/freetype-config \
"

inherit autotools
