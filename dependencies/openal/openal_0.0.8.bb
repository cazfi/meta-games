DESCRIPTION = "OpenAL is a cross-platform 3D audio API."
SECTION = "libs"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=7ec51bd663119a90c3d50704d6051fae"

PR = "r0"

DEPENDS = "alsa-lib virtual/libsdl libvorbis"

SRC_URI = "ftp://ftp.eenet.ee/pub/FreeBSD/distfiles/${PN}-${PV}.tar.gz \
"

SRC_URI[md5sum] = "641cf53761f35ee979f3e888614797a0"
SRC_URI[sha256sum] = "723e2c57c3cdffa7ff11f9b6b5478d6cb4af017e5a1ee7a56032969c39c1c2fe"

inherit autotools pkgconfig

FILES_openal-dev += "${bindir}/openal-config"

EXTRA_OECONF = "--enable-alsa --enable-sdl --enable-vorbis --disable-mp3 \
                --disable-smpeg --disable-arts"

do_configure_append () {
        sed -i "s/@requirements@/alsa vorbis/" admin/pkgconfig/openal.pc
}
