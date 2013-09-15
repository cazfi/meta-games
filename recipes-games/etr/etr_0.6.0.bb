SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SECTION = "games"

SRC_URI = "http://sourceforge.net/projects/extremetuxracer/files/releases/${PV}/etr-${PV}.tar.xz"

SRC_URI[md5sum] = "c85690864b14f9d422b73025cb01aa8d"
SRC_URI[sha256sum] = "44312719a1e9aa33e5aa0c8ad50bb52df702d64fd2d16bf2abda62ee27bf893a"

DEPENDS = "libsdl virtual/libgl libglu libsdl-image libsdl-mixer freetype"

B = "${WORKDIR}/build"

EXTRA_OECONF = "\
SDL_CONFIG=${STAGING_BINDIR_CROSS}/sdl-config \
FT2_CONFIG=${STAGING_BINDIR_CROSS}/freetype-config \
"

inherit autotools
