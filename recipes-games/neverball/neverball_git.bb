require neverball.inc

DEPENDS:append = " gettext-native virtual/libgles1 virtual/libintl libvorbis jpeg libpng libsdl2 libsdl2-ttf"

do_compile() {
	oe_runmake neverball neverputt locales desktops
}

do_install() {
	install -d -m 755 ${D}${bindir}
	install -m 755 ${B}/neverball ${D}/${bindir}/
	install -m 755 ${B}/neverputt ${D}/${bindir}/

	install -d -m 755 ${D}${datadir}/neverball
	cp -R --no-dereference --preserve=mode,links ${B}/locale ${D}${datadir}/neverball/
}
