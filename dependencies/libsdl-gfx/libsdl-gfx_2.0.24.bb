DESCRIPTION = "SDL graphics drawing primitives and other support functions."
SECTION = "libs"

LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d1de21f0b70830e299905eac3419084"

PR = "r0"

DEPENDS = "virtual/libsdl"

SRC_URI = "http://www.ferzkopp.net/Software/SDL_gfx-2.0/SDL_gfx-${PV}.tar.gz"

SRC_URI[md5sum] = "838514185ff9a3b6377760aaa52fef8a"
SRC_URI[sha256sum] = "30ad38c3e17586e5212ce4a43955adf26463e69a24bb241f152493da28d59118"

S = "${WORKDIR}/SDL_gfx-${PV}"

inherit autotools

EXTRA_OECONF += "SDL_CONFIG=${STAGING_BINDIR_CROSS}/sdl-config"
