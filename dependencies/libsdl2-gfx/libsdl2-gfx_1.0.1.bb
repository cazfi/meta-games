DESCRIPTION = "SDL2 graphics drawing primitives and other support functions."
SECTION = "libs"

LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://COPYING;md5=e04e1feb331457e9da15e0c88d0e8097"

DEPENDS = "virtual/libsdl2"

SRC_URI = "\
 http://www.ferzkopp.net/Software/SDL2_gfx/SDL2_gfx-${PV}.tar.gz \
 file://acinclude2m4.patch \
"

SRC_URI[md5sum] = "9c96816618e3e086d885d1d214e59d87"
SRC_URI[sha256sum] = "d69bcbceb811b4e5712fbad3ede737166327f44b727f1388c32581dbbe8c599a"

S = "${WORKDIR}/SDL2_gfx-${PV}"

inherit autotools pkgconfig

EXTRA_OECONF += "SDL_CONFIG=${STAGING_BINDIR_CROSS}/pkg-config sdl2"

do_unpack_append() {
    os.rename("SDL2_gfx-1.0.1/acinclude", "SDL2_gfx-1.0.1/m4")
}
