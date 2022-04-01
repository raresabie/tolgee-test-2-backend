package io.tolgee.service.dataImport.processors.po;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020\'H\u0002J\b\u0010+\u001a\u00020\'H\u0002J\t\u0010,\u001a\u00020-H\u0086\u0002J\b\u0010.\u001a\u00020\'H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\'H\u0002J\b\u00102\u001a\u00020\'H\u0002J\b\u00103\u001a\u00020\'H\u0002J\f\u00104\u001a\u00020\'*\u000205H\u0002J\f\u00106\u001a\u00020\'*\u000205H\u0002J\f\u00107\u001a\u00020\'*\u000205H\u0002J\u0010\u00108\u001a\u00020\'*\u00060\u000fj\u0002`\u0010H\u0002J\f\u00109\u001a\u00020\'*\u000205H\u0002J\f\u0010:\u001a\u00020\'*\u000205H\u0002J\f\u0010;\u001a\u00020\'*\u000205H\u0002J\u0018\u0010<\u001a\u00020\n*\u00060\u000fj\u0002`\u00102\u0006\u0010=\u001a\u00020>H\u0002J\f\u0010?\u001a\u00020\'*\u000205H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lio/tolgee/service/dataImport/processors/po/PoParser;", "", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "(Lio/tolgee/service/dataImport/processors/FileProcessorContext;)V", "createdTranslation", "Lio/tolgee/service/dataImport/processors/po/data/PoParsedTranslation;", "getCreatedTranslation", "()Lio/tolgee/service/dataImport/processors/po/data/PoParsedTranslation;", "currentEscaped", "", "currentLine", "", "currentPosition", "currentSequence", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "currentSequenceStart", "currentTranslation", "expectContext", "expectExtractedComments", "expectFlags", "expectMsgId", "expectMsgIdPlural", "expectMsgStr", "expectMsgStrPlural", "Ljava/lang/Integer;", "expectReference", "expectTranslatorComments", "expectValue", "hashed", "nextEscaped", "quoted", "translations", "", "valueProvided", "wasHash", "wasMsgStr", "currentSequenceEnd", "", "endTranslation", "handleEscapeChar", "handleHashedEnd", "handleNewLine", "invoke", "Lio/tolgee/service/dataImport/processors/po/data/PoParserResult;", "possibleEndTranslationBefore", "processHeader", "Lio/tolgee/service/dataImport/processors/po/data/PoParserMeta;", "processInputStream", "resetValueExpectations", "storeCurrent", "handle", "", "handleAfterHash", "handleHash", "handleKeyword", "handleOther", "handleQuote", "handleSpace", "isKeyword", "keyword", "", "throwUnexpected", "data"})
public final class PoParser {
    private final io.tolgee.service.dataImport.processors.FileProcessorContext context = null;
    private boolean expectMsgId = false;
    private boolean expectMsgStr = false;
    private boolean expectMsgIdPlural = false;
    private java.lang.Integer expectMsgStrPlural;
    private boolean expectTranslatorComments = false;
    private boolean expectExtractedComments = false;
    private boolean expectReference = false;
    private boolean expectFlags = false;
    private boolean expectContext = false;
    private io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation currentTranslation;
    private boolean valueProvided = false;
    private boolean expectValue = false;
    private java.util.List<io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation> translations;
    private java.lang.StringBuilder currentSequence;
    private int currentSequenceStart = 1;
    private boolean quoted = false;
    private boolean hashed = false;
    private boolean wasHash = false;
    private boolean wasMsgStr = false;
    private boolean currentEscaped = false;
    private int currentLine = 1;
    private int currentPosition = 1;
    private boolean nextEscaped = false;
    
    public PoParser(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.FileProcessorContext context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.dataImport.processors.po.data.PoParserResult invoke() {
        return null;
    }
    
    private final io.tolgee.service.dataImport.processors.po.data.PoParserMeta processHeader() {
        return null;
    }
    
    private final void handle(char $this$handle) {
    }
    
    private final void processInputStream() {
    }
    
    private final void handleHash(char $this$handleHash) {
    }
    
    private final void possibleEndTranslationBefore() {
    }
    
    private final void handleEscapeChar() {
    }
    
    private final void handleOther(char $this$handleOther) {
    }
    
    private final void handleAfterHash(char $this$handleAfterHash) {
    }
    
    private final void handleSpace(char $this$handleSpace) {
    }
    
    private final void handleQuote(char $this$handleQuote) {
    }
    
    private final void currentSequenceEnd() {
    }
    
    private final void handleHashedEnd() {
    }
    
    private final void handleKeyword(java.lang.StringBuilder $this$handleKeyword) {
    }
    
    private final boolean isKeyword(java.lang.StringBuilder $this$isKeyword, java.lang.String keyword) {
        return false;
    }
    
    private final void handleNewLine() {
    }
    
    private final void throwUnexpected(char $this$throwUnexpected) {
    }
    
    private final io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation getCreatedTranslation() {
        return null;
    }
    
    private final void storeCurrent() {
    }
    
    private final void endTranslation() {
    }
    
    private final void resetValueExpectations() {
    }
}