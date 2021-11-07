SUMMARY = "Virtual Machine for several classic adventure games"
DESCRIPTION = "Virtual Machine for several classic graphical point-and-click adventure games"
HOMEPAGE = "https://www.scummvm.org"
SECTION = "games"
PRIORITY = "optional"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit autotools-brokensep pkgconfig gtk-icon-cache manpages features_check

REQUIRED_DISTRO_FEATURES = "x11 opengl"

SRC_URI = " \
    git://github.com/scummvm/scummvm.git;protocol=https;branch=master \
    file://0001-use-pkg-config-to-gather-sdl-information.patch \
    file://0002-Do-not-split-binaries-during-install.patch \
    file://scummvm.desktop \
"
SRCREV = "f45e3184ba6d90612c7a97a4ae17dbb61c063cc8"
S = "${WORKDIR}/git"
PV = "2.2.0+git${SRCPV}"

DEPENDS = " \
    virtual/libgl \
    libsdl2 \
    libsdl2-net \
    gtk+3 \
    curl \
    hicolor-icon-theme \
    libpng \
    jpeg \
    libvorbis \
    libogg \
    libtheora \
    zlib \
    flac \
    faad2 \
    libmad \
    mpeg2dec \
    fluidsynth \
"

DISABLE_STATIC = ""

EXTRA_OECONF = " \
    --backend=sdl \
    --prefix=${prefix} \
    --mandir=${mandir} \
    --host=${HOST_SYS} \
    --enable-all-engines \
    --enable-c++11 \
    --enable-optimizations \
    --enable-plugins \
    --default-dynamic \
"

do_configure() {
    ./configure ${EXTRA_OECONF}
        sed -i "s/AS := as/AS := ${AS}/" ${S}/config.mk
        sed -i "s/AR := ar cru/AR := ${AR} cru/" ${S}/config.mk
        sed -i "s/STRIP := strip/STRIP := ${STRIP}/" ${S}/config.mk
        sed -i "s/RANLIB := ranlib/RANLIB := ${RANLIB}/" ${S}/config.mk
}

FILES:${PN} += "${datadir}"
