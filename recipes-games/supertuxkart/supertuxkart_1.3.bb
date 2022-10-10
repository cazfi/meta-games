DESCRIPTION = "SuperTuxKart is a kart racing game featuring Tux and his friends"
HOMEPAGE = "https://supertuxkart.sourceforge.net"
SECTION = "x11/application"
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0 & PD"
LIC_FILES_CHKSUM = "file://COPYING;md5=bcfdeb69518cfe348a07845ebba5c295"

DEPENDS = " \
    libogg \
    libvorbis \
    libxrandr \
    virtual/libgles2 \
    openal-soft \
    fribidi \
    curl \
    libpng \
    libjpeg-turbo \
    freetype \
    bluez5 \
    harfbuzz \
    libsdl2 \
"

inherit cmake pkgconfig gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = " \
    https://github.com/supertuxkart/stk-code/releases/download/${PV}/SuperTuxKart-${PV}-src.tar.xz \
    file://0001-Fix-MIPS-compilation.patch \
"

SRC_URI[sha256sum] = "eeabeb0d9801688a218f6f0a76ea3546a46a322ccaca9a258148ecacfe083ffd"

S = "${WORKDIR}/SuperTuxKart-${PV}-src"

# Give BSP the chance to override GL
SELECTGL ??= "-DUSE_GLES2=ON"

EXTRA_OECMAKE = " \
    ${SELECTGL} \
    -DBUILD_RECORDER=0 \
"
PACKAGECONFIG ??= " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)} \
"
PACKAGECONFIG[wayland] = "-DENABLE_WAYLAND_DEVICE=ON,-DENABLE_WAYLAND_DEVICE=OFF,wayland"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
"
