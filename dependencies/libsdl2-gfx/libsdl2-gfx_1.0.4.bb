DESCRIPTION = "SDL2 graphics drawing primitives and other support functions."
SECTION = "libs"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://COPYING;md5=e04e1feb331457e9da15e0c88d0e8097"

DEPENDS = "virtual/libsdl2"

SRC_URI = "\
 http://www.ferzkopp.net/Software/SDL2_gfx/SDL2_gfx-${PV}.tar.gz \
 file://acinclude2m4.patch \
"

SRC_URI[md5sum] = "15f9866c6464ca298f28f62fe5b36d9f"
SRC_URI[sha256sum] = "63e0e01addedc9df2f85b93a248f06e8a04affa014a835c2ea34bfe34e576262"

S = "${WORKDIR}/SDL2_gfx-${PV}"

inherit autotools pkgconfig

EXTRA_OECONF += "SDL_CONFIG=${STAGING_BINDIR_CROSS}/pkg-config sdl2"

# Disable by default, override by enabling after
EXTRA_OECONF += "--disable-mmx"
EXTRA_OECONF += "${@bb.utils.contains("TUNE_FEATURES", "m32", "--enable-mmx", "", d)}"
EXTRA_OECONF += "${@bb.utils.contains("TUNE_FEATURES", "m64", "--enable-mmx", "", d)}"

do_unpack_append() {
    os.rename("SDL2_gfx-1.0.4/acinclude", "SDL2_gfx-1.0.4/m4")
}
